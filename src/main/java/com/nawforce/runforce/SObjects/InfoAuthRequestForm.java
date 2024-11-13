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
public class InfoAuthRequestForm extends SObject {
	public static SObjectType$<InfoAuthRequestForm> SObjectType;
	public static SObjectFields$<InfoAuthRequestForm> Fields;

	public Id AuthorizationFormTextId;
	public AuthorizationFormText AuthorizationFormText;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InfoAuthorizationRequestId;
	public InfoAuthorizationRequest InfoAuthorizationRequest;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LatestAuthFormConsentId;
	public AuthorizationFormConsent LatestAuthFormConsent;
	public Datetime LatestResponseDateTime;
	public String Name;
	public String ResponseStatus;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InfoAuthRequestFormFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthorizationFormConsent[] FormConsentAuthRequestForms;
	public AuthFormRequestRecord[] FormRequestRecordAuthRequestForms;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InfoAuthRequestFormHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public InfoAuthRequestForm clone$() {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestForm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestForm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthRequestForm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
