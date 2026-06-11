/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ClaimParticipantChangeEvent extends SObject {
	public static SObjectType$<ClaimParticipantChangeEvent> SObjectType;
	public static SObjectFields$<ClaimParticipantChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ClaimId;
	public Claim Claim;
	public String ClaimInstanceIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public Boolean IsInjured;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParticipantAccountId;
	public Account ParticipantAccount;
	public Id ParticipantContactId;
	public Contact ParticipantContact;
	public String ReplayId;
	public String Roles;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public ClaimParticipantChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClaimParticipantChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClaimParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClaimParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClaimParticipantChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
