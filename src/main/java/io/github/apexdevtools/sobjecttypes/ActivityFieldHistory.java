/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActivityFieldHistory extends SObject {
	public static SObjectType$<ActivityFieldHistory> SObjectType;
	public static SObjectFields$<ActivityFieldHistory> Fields;

	public Id ActivityId;
	public SObject Activity;
	public Id ChangedById;
	public User ChangedBy;
	public Datetime ChangedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String FieldName;
	public Id Id;
	public Boolean IsDataAvailable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime NewValueDateTime;
	public Decimal NewValueNumber;
	public String NewValueText;
	public Datetime OldValueDateTime;
	public Decimal OldValueNumber;
	public String OldValueText;
	public String Operation;
	public Datetime SystemModstamp;

	public ActivityFieldHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivityFieldHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivityFieldHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivityFieldHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivityFieldHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
