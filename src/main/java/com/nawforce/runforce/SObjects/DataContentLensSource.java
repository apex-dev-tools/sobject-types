/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataContentLensSource extends SObject {
	public static SObjectType$<DataContentLensSource> SObjectType;
	public static SObjectFields$<DataContentLensSource> Fields;

	public String ContentVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataSource;
	public String DocumentVersion;
	public String FileKey;
	public String FileName;
	public String FullyQualifiedFilePath;
	public Id Id;
	public String IndexStatus;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MimeType;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DataContentLensSourceFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DataContentLensSourceHistory[] Histories;

	public DataContentLensSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataContentLensSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataContentLensSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataContentLensSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataContentLensSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
