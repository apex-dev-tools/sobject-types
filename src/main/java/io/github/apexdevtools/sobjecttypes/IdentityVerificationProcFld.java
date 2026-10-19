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
public class IdentityVerificationProcFld extends SObject {
	public static SObjectType$<IdentityVerificationProcFld> SObjectType;
	public static SObjectFields$<IdentityVerificationProcFld> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomFieldLabel;
	public String DataSourceType;
	public String DeveloperName;
	public String FieldDataType;
	public String FieldName;
	public String FieldType;
	public String FieldValueFormula;
	public Id Id;
	public Id IdentityVerificationProcDtlId;
	public IdentityVerificationProcDtl IdentityVerificationProcDtl;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsManualInput;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;

	public IdentityVerificationProcFld clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcFld clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcFld clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcFld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdentityVerificationProcFld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
