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
public class LoyaltyLedger extends SObject {
	public static SObjectType$<LoyaltyLedger> SObjectType;
	public static SObjectFields$<LoyaltyLedger> Fields;

	public Datetime ActivityDate;
	public String AdditionalNotes;
	public String Correlation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date EscrowPointsCreditDate;
	public String EventType;
	public Date ExpiryDate;
	public String Flow;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public Decimal Points;
	public Id PromotionId;
	public Promotion Promotion;
	public Datetime SystemModstamp;
	public Id TransactionJournalId;
	public TransactionJournal TransactionJournal;

	public LoyaltyLedgerTraceability[] CreditLoyaltyLedgers;
	public LoyaltyLedgerTraceability[] DebitLoyaltyLedgers;
	public LoyaltyProgramPartnerLedger[] PartnerLedgerToLoyaltyLedger;

	public LoyaltyLedger clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedger clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedger clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedger clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
