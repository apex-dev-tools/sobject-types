/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContactPointTypeConsentChangeEvent extends SObject {
	public static SObjectType$<ContactPointTypeConsentChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointTypeConsentChangeEvent> Fields;

	public Id BusinessBrandId;
	public BusinessBrand BusinessBrand;
	public String CaptureContactPointType;
	public Datetime CaptureDate;
	public String CaptureSource;
	public Object ChangeEventHeader;
	public String ContactPointType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Datetime DoubleConsentCaptureDate;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
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

	public ContactPointTypeConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
