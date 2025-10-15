/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
