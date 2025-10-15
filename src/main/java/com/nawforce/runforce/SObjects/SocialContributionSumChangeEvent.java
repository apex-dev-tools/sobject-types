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
public class SocialContributionSumChangeEvent extends SObject {
	public static SObjectType$<SocialContributionSumChangeEvent> SObjectType;
	public static SObjectFields$<SocialContributionSumChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
	public String ContribOrganizationName;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NonMonetaryCtrb;
	public String NonMonetaryCtrbType;
	public Id OwnerId;
	public User Owner;
	public String RecipientName;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
	public String Subtype;
	public Decimal TotalAmount;
	public String Type;

	public SocialContributionSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SocialContributionSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SocialContributionSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SocialContributionSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SocialContributionSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
