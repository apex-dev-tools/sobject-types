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
public class LoyaltyMemberCurrency extends SObject {
	public static SObjectType$<LoyaltyMemberCurrency> SObjectType;
	public static SObjectFields$<LoyaltyMemberCurrency> Fields;

	public Decimal BalanceBeforeReset;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EscrowPointsBalance;
	public Decimal ExpirablePoints;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastAccrualProcessedDate;
	public Datetime LastEscrowProcessedDate;
	public Date LastExpirationProcessRunDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Date LastResetDate;
	public Datetime LastViewedDate;
	public Id LoyaltyMemberId;
	public LoyaltyProgramMember LoyaltyMember;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public String Name;
	public Date NextResetDate;
	public Decimal PointsBalBeforeSecondLastReset;
	public Decimal PointsBalance;
	public Datetime RedemStlPendFromDateTime;
	public Datetime SystemModstamp;
	public Decimal TotalEscrowPointsAccrued;
	public Decimal TotalEscrowRolloverPoints;
	public Decimal TotalPointsAccrued;
	public Decimal TotalPointsExpired;
	public Decimal TotalPointsRedeemed;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LoyaltyMemberCurrencyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoyaltyMemberCurrencyHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyMemberCurrency clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrency clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrency clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
