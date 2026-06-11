/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
