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
public class MktDataLakeMapping extends SObject {
	public static SObjectType$<MktDataLakeMapping> SObjectType;
	public static SObjectFields$<MktDataLakeMapping> Fields;

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
	public String SourceFieldDeveloperName;
	public String SourceFieldNamespacePrefix;
	public String SourceFieldRef;
	public String SourceObjectDeveloperName;
	public String SourceObjectNamespacePrefix;
	public String SourceObjectRef;
	public Datetime SystemModstamp;
	public String TargetFieldDeveloperName;
	public String TargetFieldNamespacePrefix;
	public String TargetFieldRef;
	public String TargetObjectDeveloperName;
	public Id TargetObjectId;
	public MktDataLakeMapping TargetObject;
	public String TargetObjectNamespacePrefix;
	public String TargetObjectRef;

	public MktDataLakeMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktDataLakeMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktDataLakeMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktDataLakeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktDataLakeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
