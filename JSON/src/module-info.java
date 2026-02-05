/**
 * 
 */
/**
 * 
 */
module JSON {
	requires tools.jackson.databind; 
    opens com.global.json to tools.jackson.databind;
}