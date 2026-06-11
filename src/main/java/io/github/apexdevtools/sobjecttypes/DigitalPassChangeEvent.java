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
public class DigitalPassChangeEvent extends SObject {
	public static SObjectType$<DigitalPassChangeEvent> SObjectType;
	public static SObjectFields$<DigitalPassChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DigitalPassTemplateId;
	public DigitalPassTemplate DigitalPassTemplate;
	public Datetime ExpiryDate;
	public String ExternalUniqueIdentifier;
	public Id Id;
	public String InputPayload;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSyncDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PartyId;
	public SObject Party;
	public String ReplayId;
	public Id SourceRecordReferenceId;
	public SObject SourceRecordReference;
	public String Status;
	public String SyncErrorMessage;

	public DigitalPassChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalPassChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
