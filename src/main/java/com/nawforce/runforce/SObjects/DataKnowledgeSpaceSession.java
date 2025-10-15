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
public class DataKnowledgeSpaceSession extends SObject {
	public static SObjectType$<DataKnowledgeSpaceSession> SObjectType;
	public static SObjectFields$<DataKnowledgeSpaceSession> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastActiveTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String SessionKey;
	public Datetime SystemModstamp;

	public DataKnowledgeSpaceSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataKnowledgeSpaceSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataKnowledgeSpaceSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataKnowledgeSpaceSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataKnowledgeSpaceSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
