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
public class EmpUserProvisioningProcess extends SObject {
	public static SObjectType$<EmpUserProvisioningProcess> SObjectType;
	public static SObjectFields$<EmpUserProvisioningProcess> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Integer ErrorRecordCount;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ProcessStatus;
	public Datetime StartTime;
	public Integer SuccessRecordCount;
	public Datetime SystemModstamp;
	public Integer TotalRecordCount;

	public EmpUserProvisionProcessErr[] EmpUserProvisionProcessErrs;

	public EmpUserProvisioningProcess clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmpUserProvisioningProcess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmpUserProvisioningProcess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmpUserProvisioningProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmpUserProvisioningProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
