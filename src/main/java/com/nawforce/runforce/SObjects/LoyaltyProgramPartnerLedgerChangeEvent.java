/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoyaltyProgramPartnerLedgerChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramPartnerLedgerChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramPartnerLedgerChangeEvent> Fields;

	public Datetime ActivityDate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyLedgerId;
	public LoyaltyLedger LoyaltyLedger;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public Id LoyaltyProgramPartnerId;
	public LoyaltyProgramPartner LoyaltyProgramPartner;
	public Decimal Points;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;
	public Id TransactionJournalId;
	public TransactionJournal TransactionJournal;
	public String Type;

	public LoyaltyProgramPartnerLedgerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerLedgerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
