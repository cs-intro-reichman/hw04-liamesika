public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
     public static void detectAndPrint(String[] sentences, String[] keywords) {
        int length_sentences = sentences.length ; 
        int length_keywords = keywords.length ; 
        for(int i=0; i < length_sentences; i++){
            int the_in_len = sentences[i].length() ; 
            String[] parts = sentences[i].split( " ") ;
            
            int length_parts = parts.length ; 

            for(int j=0 ; j < length_parts; j++){
                for(int n = 0; n < length_keywords; n++){
                    if (keywords[n].equalsIgnoreCase(parts[j])){
                        System.out.println(sentences[i]);

                    }
                }
            }
        }
    }
}
