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
public class OmniDataTransform extends SObject {
	public static SObjectType$<OmniDataTransform> SObjectType;
	public static SObjectFields$<OmniDataTransform> Fields;

	public Decimal BatchSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExpectedInputJson;
	public String ExpectedInputOtherData;
	public String ExpectedInputXml;
	public String ExpectedOutputJson;
	public String ExpectedOutputOtherData;
	public String ExpectedOutputXml;
	public String GlobalKey;
	public Id Id;
	public String InputParsingClass;
	public String InputType;
	public Boolean IsActive;
	public Boolean IsAssignmentRulesUsed;
	public Boolean IsDeleted;
	public Boolean IsDeletedOnSuccess;
	public Boolean IsErrorIgnored;
	public Boolean IsFieldLevelSecurityEnabled;
	public Boolean IsManagedUsingStdDesigner;
	public Boolean IsNullInputsIncludedInOutput;
	public Boolean IsProcessSuperBulk;
	public Boolean IsRollbackOnError;
	public Boolean IsSourceObjectDefault;
	public Boolean IsXmlDeclarationRemoved;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Namespace;
	public String OutputParsingClass;
	public String OutputType;
	public String OverrideKey;
	public Id OwnerId;
	public Name Owner;
	public String PreprocessorClassName;
	public String PreviewJsonData;
	public String PreviewOtherData;
	public String PreviewSourceObjectData;
	public String PreviewXmlData;
	public String RequiredPermission;
	public Decimal ResponseCacheTtlMinutes;
	public String ResponseCacheType;
	public String SourceObject;
	public Decimal SynchronousProcessThreshold;
	public Datetime SystemModstamp;
	public String TargetOutputDocumentIdentifier;
	public String TargetOutputFileName;
	public String Type;
	public String UniqueName;
	public Decimal VersionNumber;
	public String XmlOutputTagsOrder;

	public OmniDataTransformItem[] OmniDataTransformItems;
	public OmniDataTransformShare[] Shares;

	public OmniDataTransform clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransform clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransform clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransform clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniDataTransform clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
