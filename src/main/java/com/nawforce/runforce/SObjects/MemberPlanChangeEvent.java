/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MemberPlanChangeEvent extends SObject {
	public static SObjectType$<MemberPlanChangeEvent> SObjectType;
	public static SObjectFields$<MemberPlanChangeEvent> Fields;

	public String Affiliation;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String ExternalIdentifier;
	public String GroupNumber;
	public Id Id;
	public String IssuerNumber;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LastVerification;
	public Id MemberId;
	public Account Member;
	public String MemberNumber;
	public String Name;
	public String Notes;
	public Id OwnerId;
	public User Owner;
	public Id PayerId;
	public Account Payer;
	public Id PayerNetworkId;
	public HealthcarePayerNetwork PayerNetwork;
	public Id PlanId;
	public PurchaserPlan Plan;
	public String PrimaryCarePhysician;
	public String PrimarySecondaryTertiary;
	public Integer PriorityOrder;
	public String RelationshipToSubscriber;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id SubscriberId;
	public Account Subscriber;
	public String VerificationStatus;

	public MemberPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MemberPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
