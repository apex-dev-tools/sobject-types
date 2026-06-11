/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserLicense extends SObject {
	public static SObjectType$<UserLicense> SObjectType;
	public static SObjectFields$<UserLicense> Fields;

	public Datetime CreatedDate;
	public Id Id;
	public Datetime LastModifiedDate;
	public String LicenseDefinitionKey;
	public String MasterLabel;
	public Integer MonthlyLoginsEntitlement;
	public Integer MonthlyLoginsUsed;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TotalLicenses;
	public Integer UsedLicenses;
	public Datetime UsedLicensesLastUpdated;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;

	public UserLicense clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserLicense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserLicense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserLicense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
