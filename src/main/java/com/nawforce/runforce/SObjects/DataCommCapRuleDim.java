/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataCommCapRuleDim extends SObject {
	public static SObjectType$<DataCommCapRuleDim> SObjectType;
	public static SObjectFields$<DataCommCapRuleDim> Fields;

	public Id CommunicationCapRuleId;
	public DataCommCapRule CommunicationCapRule;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataCommCapDimId;
	public DataCommCapDim DataCommCapDim;
	public Id DataCommCapDimValueId;
	public DataCommCapDimValue DataCommCapDimValue;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public DataCommCapRuleDim clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataCommCapRuleDim clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataCommCapRuleDim clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataCommCapRuleDim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataCommCapRuleDim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
