/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyLedgerChangeEvent extends SObject {
	public static SObjectType$<LoyaltyLedgerChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyLedgerChangeEvent> Fields;

	public Datetime ActivityDate;
	public String AdditionalNotes;
	public Object ChangeEventHeader;
	public String Correlation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date EscrowPointsCreditDate;
	public String EventType;
	public Date ExpiryDate;
	public String Flow;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public Decimal Points;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;
	public Id TransactionJournalId;
	public TransactionJournal TransactionJournal;

	public LoyaltyLedgerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedgerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyLedgerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
