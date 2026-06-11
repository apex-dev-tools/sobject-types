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
public class FieldServiceOrgSettings extends SObject {
	public static SObjectType$<FieldServiceOrgSettings> SObjectType;
	public static SObjectFields$<FieldServiceOrgSettings> Fields;

	public Integer AdsPollingIntervalSec;
	public Boolean CanPopulateGoogleAddress;
	public Boolean CanSendAppCenterCrashReports;
	public Boolean CanStoreMobileAnalytics;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeepLinkPublicSecurityKey;
	public String DeveloperName;
	public Boolean DoesAvlCalcInclOvertime;
	public Boolean DoesAvlCalcInclPrimOnly;
	public String EnrouteStatus;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MobileFeedbackEmails;
	public Datetime SystemModstamp;

	public FieldServiceOrgSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceOrgSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceOrgSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceOrgSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceOrgSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
