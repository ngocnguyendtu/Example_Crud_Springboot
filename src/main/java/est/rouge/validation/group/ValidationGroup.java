package est.rouge.validation.group;

import javax.validation.GroupSequence;

/**
 * Validation group
 * 
 * @author ngocnguyen
 */
@GroupSequence({GroupHigh.class, GroupMedium.class, GroupLow.class})
public interface ValidationGroup {

}
