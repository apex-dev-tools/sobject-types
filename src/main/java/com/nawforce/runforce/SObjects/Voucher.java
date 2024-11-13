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
public class Voucher extends SObject {
	public static SObjectType$<Voucher> SObjectType;
	public static SObjectFields$<Voucher> Fields;

	public Id AccountId;
	public Account Account;
	public Id BenefitId;
	public Benefit Benefit;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DiscountPercent;
	public Date EffectiveDate;
	public Datetime EffectiveDateTime;
	public Date ExpirationDate;
	public Datetime ExpirationDateTime;
	public Decimal FaceValue;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PromotionId;
	public Promotion Promotion;
	public String Reason;
	public Decimal RedeemedValue;
	public Decimal RemainingValue;
	public String ReservationKey;
	public Datetime ReservedDateTime;
	public Decimal ReservedValue;
	public String Status;
	public Datetime SystemModstamp;
	public Id TransactionJournalId;
	public TransactionJournal TransactionJournal;
	public Date UseDate;
	public String VoucherCode;
	public Id VoucherDefinitionId;
	public VoucherDefinition VoucherDefinition;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public EngagementTopic[] EngagementInitiatedTopic;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public VoucherHistory[] Histories;
	public GameParticipantReward[] IssuedRewardReferences;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public VoucherShare[] Shares;

	public Voucher clone$() {throw new java.lang.UnsupportedOperationException();}
	public Voucher clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Voucher clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Voucher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Voucher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
