/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentWorkspace extends SObject {
	public static SObjectType$<ContentWorkspace> SObjectType;
	public static SObjectFields$<ContentWorkspace> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultRecordTypeId;
	public RecordType DefaultRecordType;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsRestrictContentTypes;
	public Boolean IsRestrictLinkedContentTypes;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastWorkspaceActivityDate;
	public String Name;
	public String NamespacePrefix;
	public Id RootContentFolderId;
	public ContentFolder RootContentFolder;
	public Boolean ShouldAddCreatorMembership;
	public Datetime SystemModstamp;
	public String TagModel;
	public Id WorkspaceImageId;
	public ContentAsset WorkspaceImage;
	public String WorkspaceType;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContentFolderLink[] ContentFolderLinks;
	public ContentWorkspaceMember[] ContentWorkspaceMembers;

	public ContentWorkspace clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspace clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
