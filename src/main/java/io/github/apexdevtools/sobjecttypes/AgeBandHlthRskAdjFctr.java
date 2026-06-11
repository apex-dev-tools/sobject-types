/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AgeBandHlthRskAdjFctr extends SObject {
	public static SObjectType$<AgeBandHlthRskAdjFctr> SObjectType;
	public static SObjectFields$<AgeBandHlthRskAdjFctr> Fields;

	public Decimal AgeBandEnd;
	public Decimal AgeBandStart;
	public Decimal CmnyFullBnftDualDisabled;
	public Decimal CmnyPartialBenefitDualAged;
	public Decimal CmnyPartialBnftDualDsbl;
	public Decimal Community;
	public Decimal CommunityFullBnftDualAged;
	public Decimal CommunityNonDualAged;
	public Decimal CommunityNonDualDisabled;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrolleeType;
	public String Gender;
	public Id Id;
	public Decimal Institutional;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer PublishedYear;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AgeBandHlthRskAdjFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AgeBandHlthRskAdjFctrHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AgeBandHlthRskAdjFctrShare[] Shares;

	public AgeBandHlthRskAdjFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
