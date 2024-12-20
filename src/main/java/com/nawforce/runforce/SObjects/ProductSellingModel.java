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
public class ProductSellingModel extends SObject {
	public static SObjectType$<ProductSellingModel> SObjectType;
	public static SObjectFields$<ProductSellingModel> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer PricingTerm;
	public String PricingTermUnit;
	public String SellingModelType;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AttributeBasedAdjustment[] AttributeBasedAdjustments;
	public BundleBasedAdjustment[] BundleBasedAdjustments;
	public ProductRelatedComponent[] ChildProductRelatedComponents;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductSellingModelFeed[] Feeds;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductSellingModelHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProductRelatedComponent[] ParentProductRelatedComponents;
	public PriceAdjustmentTier[] PriceAdjustmentTiers;
	public PriceBookEntryDerivedPrice[] PriceBookEntryDerivedPrices;
	public PricebookEntry[] PricebookEntries;
	public ProductSellingModelOption[] ProductSellingModelOptions;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ProductSellingModel clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
