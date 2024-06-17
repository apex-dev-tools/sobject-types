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
public class PgmBasedHlthRskAdjFctr extends SObject {
	public static SObjectType$<PgmBasedHlthRskAdjFctr> SObjectType;
	public static SObjectFields$<PgmBasedHlthRskAdjFctr> Fields;

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
	public String Gender;
	public Id Id;
	public Decimal Institutional;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsDisabled;
	public Boolean IsOriginallyDisabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProgramType;
	public Integer PublishedYear;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PgmBasedHlthRskAdjFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PgmBasedHlthRskAdjFctrHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PgmBasedHlthRskAdjFctrShare[] Shares;

	public PgmBasedHlthRskAdjFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public PgmBasedHlthRskAdjFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PgmBasedHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PgmBasedHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PgmBasedHlthRskAdjFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
