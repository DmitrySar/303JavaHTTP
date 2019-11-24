class HTTPAnalizer {

    private HTTPReader reader;

    public HTTPAnalizer(HTTPReader reader) {
        this.reader = reader;
    }

    public String getResult() {
    	String result = reader.getHTML();
    	result = result.replaceAll("\n", "");
    	result = result.replaceAll(".*<span class=\"hours\" data-prop=\"hours\">", "");
    	result = result.replaceAll("<div class=\"timeview-info\">.*", "");
    	result = result.replaceAll("\\D*", "");
    	String hh = result.substring(0, 2);
    	String mm = result.substring(2, 4);
    	String ss = result.substring(4, 6);
    	result = String.format("%s:%s:%s", hh, mm, ss);
        return result;
    }

}
