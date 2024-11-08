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
public class GeneratedDocumentSection extends SObject {
	public static SObjectType$<GeneratedDocumentSection> SObjectType;
	public static SObjectFields$<GeneratedDocumentSection> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DisplayHeaderFontStyle;
	public Id DocumentTemplateSectionId;
	public DocumentTemplateSection DocumentTemplateSection;
	public Id GeneratedDocumentId;
	public GeneratedDocument GeneratedDocument;
	public Id Id;
	public Boolean IsBeginSplitSection;
	public Boolean IsDeleted;
	public Boolean IsEndSplitSection;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String SectionContent;
	public Decimal SectionOrder;
	public String SectionTypeSignatureContent;
	public Decimal SplitSectionSequenceNumber;
	public Datetime SystemModstamp;
	public String TemplateSectionContent;
	public String TokenList;
	public String XmlContent;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public GeneratedDocumentSectionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocumentSectionHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GeneratedDocumentSection clone$() {throw new java.lang.UnsupportedOperationException();}
	public GeneratedDocumentSection clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedDocumentSection clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedDocumentSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedDocumentSection clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
