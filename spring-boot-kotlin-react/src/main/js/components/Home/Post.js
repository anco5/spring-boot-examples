import React from 'react';
import agent from '../../agent';

const Post = props => {
    const posts = props.posts;
    if (posts) {
        return (
            <div className="posts-list">
                {
                    posts.map(post => {
                        <p key={post.id}>
                            {post.title}
                        </p>
                    });
                }
            </div>
        );
    } else {
        return (
            <div>Loading Posts...</div>
        );
    }
};

export default Post;