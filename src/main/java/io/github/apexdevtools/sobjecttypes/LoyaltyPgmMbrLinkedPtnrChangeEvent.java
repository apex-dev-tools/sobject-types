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
public class LoyaltyPgmMbrLinkedPtnrChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmMbrLinkedPtnrChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmMbrLinkedPtnrChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LinkDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public Id LoyaltyProgramPartnerId;
	public LoyaltyProgramPartner LoyaltyProgramPartner;
	public String Name;
	public String ReplayId;
	public Datetime UnlinkDate;
	public String UnlinkReasonType;

	public LoyaltyPgmMbrLinkedPtnrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrLinkedPtnrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
