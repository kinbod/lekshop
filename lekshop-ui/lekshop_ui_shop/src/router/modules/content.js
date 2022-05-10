/** When your routing table is too long, you can split it into small modules**/

import Layout from '@/layout'

//内容管理路由配置
const contentRouter = {
  path: '/content',
  component: Layout,
  redirect: '/system/content/banner',
  name: 'content',
  meta: {
    title: '内容管理',
    icon: 'table'
  },
  children: [
    {
      path: 'banner',
      component: () => import('@/views/content/banner/index'),
      name: 'bannerTable',
      meta: { title: '轮播图', icon: 'list', role: ['admin'] }
    },
    {
      path: 'advert',
      component: () => import('@/views/content/advert/index'),
      name: 'advertTable',
      meta: { title: '广告图设置',  icon: 'list', role: ['admin'] }
    },
		{
		  path: 'agreement',
		  component: () => import('@/views/content/agreement/index'),
		  name: 'agreementTable',
		  meta: { title: '协议文案', icon: 'list',  role: ['admin'] }
		},
    {
      path: 'feedback',
      component: () => import('@/views/content/feedback/index'),
      name: 'feedbackTable',
      meta: { title: '意见反馈', icon: 'list',  role: ['admin'] }
    },
    {
      path: 'articleCate',
      component: () => import('@/views/content/articleCate/index'),
      name: 'articleCate',
      meta: { title: '文章分类', icon: 'list',  role: ['admin'] }
    },
		{
		  path: 'article',
		  component: () => import('@/views/content/article/index'),
		  name: 'articleTable',
		  meta: { title: '文章列表', icon: 'list',  role: ['admin'] }
		},
		{
			path: 'article/create',
			component: () => import('@/views/content/article/create'),
			name: 'createArticle',
			meta: { title: '发表文章', role: ['admin']},
			hidden: true
		},
		{
			path: 'article/edit/:id(\\d+)',
			component: () => import('@/views/content/article/edit'),
			name: 'editArticle',
			meta: { title: '编辑文章', role: [] },
			hidden: true
		},
    {
      path: 'notice',
      component: () => import('@/views/content/notice/index'),
      name: 'notice',
      meta: { title: '公告管理', icon: 'list',  role: ['admin'] }
    },
    {
      path: 'source',
      component: () => import('@/views/content/source/index'),
      name: 'source',
      meta: { title: '素材管理', icon: 'list',  role: ['admin'] }
    },

  ]
}
export default contentRouter