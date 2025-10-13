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
public class PersnlTransformer extends SObject {
	public static SObjectType$<PersnlTransformer> SObjectType;
	public static SObjectFields$<PersnlTransformer> Fields;

	public String Category;
	public String Channel;
	public String ComponentName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public String Html;
	public Id Id;
	public Boolean IsAutoEngmntAttrsDisabled;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id PersonalizationSchemaId;
	public PersonalizationSchema PersonalizationSchema;
	public Datetime PublishedDate;
	public String Script;
	public Datetime SystemModstamp;
	public String TransformerType;

	public PersnlTransformer clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlTransformer clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlTransformer clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlTransformer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlTransformer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
