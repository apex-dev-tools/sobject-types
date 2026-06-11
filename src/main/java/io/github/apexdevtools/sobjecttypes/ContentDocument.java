/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public Long ContentSizeLong;
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
	public CareRequestSupportingCntnt[] CRSContent_ReferenceRecords;
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
