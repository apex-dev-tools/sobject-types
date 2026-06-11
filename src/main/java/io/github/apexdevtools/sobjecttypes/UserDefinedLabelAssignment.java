/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserDefinedLabelAssignment extends SObject {
	public static SObjectType$<UserDefinedLabelAssignment> SObjectType;
	public static SObjectFields$<UserDefinedLabelAssignment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EntityType;
	public Id Id;
	public Boolean IsDeleted;
	public Id ItemId;
	public SObject Item;
	public Id LabelId;
	public UserDefinedLabel Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public Name Owner;
	public Integer SortOrder;
	public String SubjectOrName;
	public Datetime SystemModstamp;

	public UserDefinedLabelAssignmentShare[] Shares;

	public UserDefinedLabelAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserDefinedLabelAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserDefinedLabelAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserDefinedLabelAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserDefinedLabelAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
