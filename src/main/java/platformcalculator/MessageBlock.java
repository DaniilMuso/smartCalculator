package platformcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MessageBlock {

    private static final int DEFAULT_WIDTH = 55;
    private final String value;

    public MessageBlock(int width, String header, String footer, List<String> sections) {
        if(width < 10) {
            throw new IllegalArgumentException("Ширина не должна быть меньше 10");
        }
        if(header.length() > width) {
            throw new IllegalArgumentException("Заголовок превышает ширину блока");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(nCopies("_", width)).append(" \n");

        sb.append("|").append(nCopies("=", width)).append("|\n");
        sb.append("|").append(injectContentIntoFilledLine("=", header, width)).append("|\n");
        sb.append("|").append(nCopies("=", width)).append("|\n");

        var sectionsIterator = sections.iterator();
        while(sectionsIterator.hasNext()) {
            for(String sectionRow : sectionsIterator.next().split("\r?\n")) {
                for (String sectionClip : clippedSection(sectionRow, width)) {
                    sb.append("|")
                            .append(sectionClip)
                            .append(nCopies(" ", width - sectionClip.length()))
                            .append("|\n");
                }
            }
            if(sectionsIterator.hasNext()) {
                sb.append("|").append(nCopies("=", width)).append("|\n");
            }
        }

        if(footer != null) {
            sb.append("|").append(nCopies("=", width)).append("|\n");
            sb.append("|").append(injectContentIntoFilledLine("=", footer, width)).append("|\n");
            sb.append("|").append(nCopies("=", width)).append("|\n");
        }

        sb.append(" ").append(nCopies("‾", width)).append(" ");
        value = sb.toString();
    }

    public MessageBlock(String header, String footer, String... sections) {
        this(DEFAULT_WIDTH, header, footer, List.of(sections));
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return value;
    }

    private static String[] clippedSection(String section, int width) {
        return IntStream
                .iterate(0, i -> i + width)
                .limit((int) Math.ceil(section.length() / (double) width))
                .mapToObj(i -> section.substring(i, Math.min(i + width, section.length())))
                .toArray(String[]::new);
    }

    private static String injectContentIntoFilledLine(String filler, String content, int width) {
        int fillersWidth = width - content.length();
        int leftFillersWith = (int) Math.floor(fillersWidth / 2.0);
        return nCopies(filler, leftFillersWith) +
                content +
                nCopies(filler, width - content.length() - leftFillersWith);
    }

    private static String nCopies(String s, int copies) {
        String[] copiesArray = new String[copies];
        Arrays.fill(copiesArray, s);
        return String.join("", copiesArray);
    }

    public static class Builder {
        private int width = DEFAULT_WIDTH;
        private String header;
        private String footer;
        private List<String> sections = new ArrayList<>();

        private Builder() {
        }

        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setHeader(String header) {
            this.header = header;
            return this;
        }

        public Builder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Builder setSections(List<String> sections) {
            this.sections = sections;
            return this;
        }

        public Builder addSection(String... sections) {
            this.sections.add(String.join("\n", sections));
            return this;
        }

        public MessageBlock build() {
            return new MessageBlock(width, header, footer, sections);
        }
    }

}
