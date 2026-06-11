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
public class FolderedContentDocument extends SObject {
	public static SObjectType$<FolderedContentDocument> SObjectType;
	public static SObjectFields$<FolderedContentDocument> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Integer ContentSize;
	public Long ContentSizeLong;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FileExtension;
	public String FileType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsFolder;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentContentFolderId;
	public ContentFolder ParentContentFolder;
	public Datetime SystemModstamp;
	public String Title;

	public FolderedContentDocument clone$() {throw new java.lang.UnsupportedOperationException();}
	public FolderedContentDocument clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FolderedContentDocument clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FolderedContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FolderedContentDocument clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
