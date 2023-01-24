/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CommSubscriptionConsentChangeEvent extends SObject {
	public static SObjectType$<CommSubscriptionConsentChangeEvent> SObjectType;
	public static SObjectFields$<CommSubscriptionConsentChangeEvent> Fields;

	public Id BusinessBrandId;
	public BusinessBrand BusinessBrand;
	public Object ChangeEventHeader;
	public Id CommSubscriptionChannelTypeId;
	public CommSubscriptionChannelType CommSubscriptionChannelType;
	public Datetime ConsentCapturedDateTime;
	public String ConsentCapturedSource;
	public Id ConsentGiverId;
	public SObject ConsentGiver;
	public Id ContactPointId;
	public SObject ContactPoint;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PartyRoleId;
	public SObject PartyRole;
	public String PrivacyConsentStatus;
	public String ReplayId;

	public CommSubscriptionConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
