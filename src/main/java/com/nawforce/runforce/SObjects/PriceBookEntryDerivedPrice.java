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
public class PriceBookEntryDerivedPrice extends SObject {
	public static SObjectType$<PriceBookEntryDerivedPrice> SObjectType;
	public static SObjectFields$<PriceBookEntryDerivedPrice> Fields;

	public Id ContributingProductId;
	public Product2 ContributingProduct;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DerivedPricingScope;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public String Formula;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id PricebookId;
	public Pricebook2 Pricebook;
	public String PricingSource;
	public Id ProductId;
	public Product2 Product;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
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
	public PriceBookEntryDerivedPriceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PriceBookEntryDerivedPriceHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PriceBookEntryDerivedPriceShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PriceBookEntryDerivedPrice clone$() {throw new java.lang.UnsupportedOperationException();}
	public PriceBookEntryDerivedPrice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PriceBookEntryDerivedPrice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PriceBookEntryDerivedPrice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PriceBookEntryDerivedPrice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
