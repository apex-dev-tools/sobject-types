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
public class ProductClassificationAttr extends SObject {
	public static SObjectType$<ProductClassificationAttr> SObjectType;
	public static SObjectFields$<ProductClassificationAttr> Fields;

	public Id AttributeCategoryId;
	public AttributeCategory AttributeCategory;
	public Id AttributeDefinitionId;
	public AttributeDefinition AttributeDefinition;
	public String AttributeNameOverride;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultValue;
	public String Description;
	public String DisplayType;
	public String ExcludedPicklistValues;
	public String HelpText;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHidden;
	public Boolean IsPriceImpacting;
	public Boolean IsReadOnly;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaximumCharacterCount;
	public String MaximumValue;
	public Integer MinimumCharacterCount;
	public String MinimumValue;
	public String Name;
	public Id OverriddenInheritedAttributeId;
	public ProductClassificationAttr OverriddenInheritedAttribute;
	public Id OwnerId;
	public Name Owner;
	public Id ProductClassificationId;
	public ProductClassification ProductClassification;
	public Integer Sequence;
	public String Status;
	public String StepValue;
	public Datetime SystemModstamp;
	public String ValueDescription;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AttrPicklistExcludedValue[] AttrPicklistExcludedValues;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductClassificationAttrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductClassificationAttrHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProductClassificationAttr[] OverriddenInheritedProdClassAttrs;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProdtAttrMappedScope[] ProdtAttrMappedScopes;
	public ProductAttributeDefinition[] ProductClassificationAttributes;
	public ProductClassificationAttrShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ProductClassificationAttr clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationAttr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationAttr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationAttr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
