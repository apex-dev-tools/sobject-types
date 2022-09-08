/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class KnowledgeableUser extends SObject {
	public static SObjectType$<KnowledgeableUser> SObjectType;
	public static SObjectFields$<KnowledgeableUser> Fields;

	public Id Id;
	public Id NetworkId;
	public Network Network;
	public Integer RawRank;
	public Datetime SystemModstamp;
	public Id TopicId;
	public Topic Topic;
	public Id UserId;
	public User User;

	public KnowledgeableUser clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeableUser clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeableUser clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeableUser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeableUser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
