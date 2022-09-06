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
public class PartyConsentChangeEvent extends SObject {
	public static SObjectType$<PartyConsentChangeEvent> SObjectType;
	public static SObjectFields$<PartyConsentChangeEvent> Fields;

	public String Action;
	public Id BusinessBrandId;
	public BusinessBrand BusinessBrand;
	public String CaptureContactPointType;
	public Datetime CaptureDate;
	public String CaptureSource;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DoubleConsentCaptureDate;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PartyId;
	public Individual Party;
	public Id PartyRoleId;
	public SObject PartyRole;
	public String PrivacyConsentStatus;
	public String ReplayId;

	public PartyConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyConsentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
