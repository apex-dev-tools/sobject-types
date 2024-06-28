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
public class ProductRelComponentOverride extends SObject {
	public static SObjectType$<ProductRelComponentOverride> SObjectType;
	public static SObjectFields$<ProductRelComponentOverride> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Boolean DoesBundlePriceIncludeChild;
	public Id Id;
	public Boolean IsComponentRequired;
	public Boolean IsDefaultComponent;
	public Boolean IsDeleted;
	public Boolean IsExcluded;
	public Boolean IsQuantityEditable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal MaxQuantity;
	public Decimal MinQuantity;
	public String Name;
	public Id OverrideContextId;
	public Name OverrideContext;
	public Id OwnerId;
	public Name Owner;
	public Id ProductRelatedComponentId;
	public ProductRelatedComponent ProductRelatedComponent;
	public Decimal Quantity;
	public String QuantityScaleMethod;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductRelComponentOverrideFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductRelComponentOverrideHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRelComponentOverrideShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ProductRelComponentOverride clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverride clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverride clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverride clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
