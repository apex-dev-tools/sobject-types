/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataSpaceFilterCondition extends SObject {
	public static SObjectType$<DataSpaceFilterCondition> SObjectType;
	public static SObjectFields$<DataSpaceFilterCondition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataSpaceFilterCriteriaId;
	public DataSpaceFilterCriteria DataSpaceFilterCriteria;
	public String DeveloperName;
	public String FilterFieldRef;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String Operator;
	public Datetime SystemModstamp;
	public Id TargetObjectId;
	public MktDataLakeMapping TargetObject;
	public String TargetObjectRef;
	public String Value;

	public DataSpaceFilterCondition clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCondition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCondition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataSpaceFilterCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
