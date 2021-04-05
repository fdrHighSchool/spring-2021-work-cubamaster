import java.util.List;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        int colon = message.indexOf(":");
        this.machineId = message.substring(0, colon);
        this.description = message.substring(colon+1, message.length());
    }

    public boolean containsWord(String keyword) {
        for(String word : this.description.split(" ")) {
            if(word == keyword) {
                return true;
            }
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }


    public class SystemLog {
        private List<LogMessage> messageList;
        public List<LogMessage> removeMessage (String keyword) {
            List<LogMessage> keyword_message = null;
            for(int i = messageList.size() - 1; i >= 0; i--) {
                if(messageList.get(i).containsWord(keyword)) {
                    keyword_message.add(messageList.get(i));
                    messageList.remove(i);
                }
            }
            return keyword_message;
        }
    }

}
