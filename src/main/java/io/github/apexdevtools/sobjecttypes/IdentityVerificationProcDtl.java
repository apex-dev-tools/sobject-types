/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class IdentityVerificationProcDtl extends SObject {
	public static SObjectType$<IdentityVerificationProcDtl> SObjectType;
	public static SObjectFields$<IdentityVerificationProcDtl> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSourceType;
	public String DeveloperName;
	public String DisplayRecordFieldName;
	public Id Id;
	public Id IdentityVerificationProcDefId;
	public IdentityVerificationProcDef IdentityVerificationProcDef;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LinkedIdVerfProcessDetId;
	public IdentityVerificationProcDtl LinkedIdVerfProcessDet;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ObjectName;
	public Integer OptionalVerifiersMinVerfCount;
	public String SearchFilter;
	public String SearchRecordUniqueIdField;
	public String SearchResultSortBy;
	public Integer SearchSequenceNumber;
	public String SearchType;
	public Datetime SystemModstamp;

	public IdentityVerificationProcDtl[] LinkedIdVerfProcessDets;

	public IdentityVerificationProcDtl clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcDtl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcDtl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
