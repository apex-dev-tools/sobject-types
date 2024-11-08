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
public class OmniProcess extends SObject {
	public static SObjectType$<OmniProcess> SObjectType;
	public static SObjectFields$<OmniProcess> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CustomHtmlTemplates;
	public String CustomJavaScript;
	public String Description;
	public String DesignerCustomizationType;
	public String DiscoveryFrameworkUsageType;
	public String ElementTypeComponentMapping;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsIntegrationProcedure;
	public Boolean IsMetadataCacheDisabled;
	public Boolean IsOmniScriptEmbeddable;
	public Boolean IsTestProcedure;
	public Boolean IsWebCompEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastPreviewPage;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Namespace;
	public String OmniProcessKey;
	public String OmniProcessType;
	public String OverrideKey;
	public Id OwnerId;
	public Name Owner;
	public String PropertySetConfig;
	public String RequiredPermission;
	public String ResponseCacheType;
	public String SubType;
	public Datetime SystemModstamp;
	public String Type;
	public String UniqueName;
	public Decimal VersionNumber;
	public String WebComponentKey;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public CareProgramDetail[] DetailRecords;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OmniProcessFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OmniScriptSavedSession[] OSSavedSessionOmniProcess;
	public OmniProcessCompilation[] OmniProcessDefinitions;
	public OmniProcessElement[] OmniProcessElements;
	public OmniProcessShare[] Shares;

	public OmniProcess clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniProcess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
