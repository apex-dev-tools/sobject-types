/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CareSystemFieldMapping extends SObject {
	public static SObjectType$<CareSystemFieldMapping> SObjectType;
	public static SObjectFields$<CareSystemFieldMapping> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String ExternalIdField;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Role;
	public String SourceSystem;
	public Datetime SystemModstamp;
	public String TargetObject;

	public CareSystemFieldMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareSystemFieldMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareSystemFieldMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareSystemFieldMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareSystemFieldMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
