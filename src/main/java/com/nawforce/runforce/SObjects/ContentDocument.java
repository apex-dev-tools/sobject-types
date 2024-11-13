/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentDocument extends SObject {
	public static SObjectType$<ContentDocument> SObjectType;
	public static SObjectFields$<ContentDocument> Fields;

	public Id ArchivedById;
	public User ArchivedBy;
	public Date ArchivedDate;
	public Id ContentAssetId;
	public ContentAsset ContentAsset;
	public Datetime ContentModifiedDate;
	public Integer ContentSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String Division;
	public String FileExtension;
	public String FileType;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsInternalOnly;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LatestPublishedVersionId;
	public ContentVersion LatestPublishedVersion;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public ContentWorkspace Parent;
	public String PublishStatus;
	public String SharingOption;
	public String SharingPrivacy;
	public Datetime SystemModstamp;
	public String Title;

	public NetworkActivityAudit[] AuditableEntities;
	public AssessmentTaskContentDocument[] AssessmentTaskContentDocuments;
	public AuthorizationFormText[] AuthorizationFormTexts;
	public CareRequestReviewer[] CRRContentDocuments;
	public ContentDistribution[] ContentDistributions;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContentLink[] ContentLinkReferenceObjectRelation;
	public ContentVersion[] ContentVersions;
	public DiagnosticSummary[] DiagnosticSummary_ContentDocument;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentGenerationProcess[] DocGenerationProcessContentDocs;
	public DocumentTemplateContentDoc[] DocTempContentDocContentDocs;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContentDocumentFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthcareProvider[] HealthcareProvidersPhoto;
	public ContentDocumentHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public IntegrationProviderExecution[] IntegrationProviderExecutions;
	public SearchableReferenceDocument[] SearchableReferenceDocumentContentDocs;
	public TopicAssignment[] TopicAssignments;

	public ContentDocument clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
