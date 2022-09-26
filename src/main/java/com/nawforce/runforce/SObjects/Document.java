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
public class Document extends SObject {
	public static SObjectType$<Document> SObjectType;
	public static SObjectFields$<Document> Fields;

	public Id AuthorId;
	public User Author;
	public Blob Body;
	public Integer BodyLength;
	public String ContentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id FolderId;
	public SObject Folder;
	public Id Id;
	public Boolean IsBodySearchable;
	public Boolean IsDeleted;
	public Boolean IsInternalUseOnly;
	public Boolean IsPublic;
	public String Keywords;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String Type;
	public String Url;

	public Document clone$() {throw new java.lang.UnsupportedOperationException();}
	public Document clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Document clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Document clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Document clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
