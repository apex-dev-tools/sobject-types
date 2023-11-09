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
public class ContactPointTypeConsent extends SObject {
	public static SObjectType$<ContactPointTypeConsent> SObjectType;
	public static SObjectFields$<ContactPointTypeConsent> Fields;

	public Id BusinessBrandId;
	public BusinessBrand BusinessBrand;
	public String CaptureContactPointType;
	public Datetime CaptureDate;
	public String CaptureSource;
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
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PartyId;
	public Individual Party;
	public Id PartyRoleId;
	public Name PartyRole;
	public String PrivacyConsentStatus;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ContactPointTypeConsentHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactPointTypeConsentShare[] Shares;

	public ContactPointTypeConsent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointTypeConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
