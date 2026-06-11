/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataSpaceFilterCriteria extends SObject {
	public static SObjectType$<DataSpaceFilterCriteria> SObjectType;
	public static SObjectFields$<DataSpaceFilterCriteria> Fields;

	public String ChildType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String Operator;
	public Id ParentId;
	public DataSpaceFilterCriteria Parent;
	public Datetime SystemModstamp;

	public DataSpaceFilterCriteria clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCriteria clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
